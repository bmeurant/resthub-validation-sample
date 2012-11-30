define([ 'backbone', 'resthub', 'model/user', 'hbs!template/user', 'backbone-validation'],
function (Backbone, Resthub, User, userTemplate) {

    var UserView = Resthub.View.extend({

        // Define view template
        template: userTemplate,

        events: {
          'submit form': 'onSubmitForm'
        },

        initialize: function() {
          // Initialize the collection
          this.model = new User();

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

    return UserView;
});