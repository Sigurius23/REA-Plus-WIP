.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/search/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/search/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/a;->x:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/a;->x:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    check-cast p1, Ll83/a0;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;->b(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Ll83/a0;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/a;->x:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;->a(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
