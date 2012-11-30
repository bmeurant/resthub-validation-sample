define(['backbone', 'resthub'], function(Backbone, Resthub) {
    var SampleModel = Backbone.Model.extend({

        className: 'org.resthub.validation.model.Sample',
        excludes: ['ignoredProp'],

        initialize: function () {
            Resthub.Validation.synchronize(SampleModel);
        }

    });
    return SampleModel;
});