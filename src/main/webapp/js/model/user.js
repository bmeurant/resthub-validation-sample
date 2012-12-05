define(['backbone', 'resthub'], function(Backbone, Resthub) {
    var UserModel = Backbone.Model.extend({

        className: 'org.resthub.validation.model.User2',
        messages: {
          'validation.URL.message': 'url should be a valid url based on http protocol',
          'validation.NotNull.message': 'should not be null'
        },

        initialize: function () {
            Resthub.Validation.synchronize(UserModel, this.messages);
        },

        validation: {
            confirmPassword: {
                equalTo: 'password'
            }
        }

    });
    return UserModel;
});