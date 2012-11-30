define([ 'backbone', 'resthub', 'model/sample', 'hbs!template/sample', 'backbone-validation'],
function (Backbone, Resthub, Sample, sampleTemplate) {

    var SampleView = Resthub.View.extend({

        // Define view template
        template: sampleTemplate,

        events: {
          'submit form': 'onSubmitForm'
        },

        initialize: function() {
          // Initialize the collection
          this.model = new Sample();

          Backbone.Validation.bind(this);

          this.render();
        },

        onSubmitForm: function(event) {
            if (event != null) {
                event.stopPropagation();
                event.preventDefault();
            }

            this.save();
        },

        save: function() {
            this.populateModel();

            if (this.model.isValid()) {
                this.$('.alerts .alert').removeClass('alert-error') ;
                this.$('.alerts .alert').addClass('alert-success');
                this.$('.alerts .alert .message').text('Congrats, Form is Valid !');
            } else {
                this.$('.alerts .alert').removeClass('alert-success') ;
                this.$('.alerts .alert').addClass('alert-error');
                this.$('.alerts .alert .message').text('Too bad, Form is invalid !');
            }

          this.$('.alerts .alert').show();
        }

    });

    return SampleView;
});