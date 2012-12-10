define(['backbone', 'resthub'], function(Backbone, Resthub) {
    var UserModel = Backbone.Model.extend({

        className: 'org.resthub.validation.model.User',
        messages: {
          'validation.URL.message': 'url should be a valid url based on http protocol',
          'validation.NotNull.message': 'should not be null'
        },

        initialize: function (attributes, options) {
            Resthub.Validation.synchronize(UserModel, options.errorCallback);
        },

        validation: {
            confirmPassword: {
                equalTo: 'password'
            }
        }
    });
    return UserModel;
});