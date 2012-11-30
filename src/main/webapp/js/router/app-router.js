define(['backbone', 'view/sample-view', 'view/user-view'],
function (Backbone, SampleView, UserView) {
    
    var AppRouter = Backbone.Router.extend({

        initialize: function() {
            Backbone.history.start({ pushState: true, root: "/" });
        },

        routes:{
            '': 'sample',
            'sample': 'sample',
            'user': 'user'
        },

        sample:function () {
            new SampleView({ root: $('#main') });
            Backbone.$('.nav li').removeClass('active');
            Backbone.$('.nav li#sample').addClass('active');
        },

        user:function () {
            new UserView({ root: $('#main') });
            Backbone.$('.nav li').removeClass('active');
            Backbone.$('.nav li#user').addClass('active');
        }

    });

    return AppRouter;

});