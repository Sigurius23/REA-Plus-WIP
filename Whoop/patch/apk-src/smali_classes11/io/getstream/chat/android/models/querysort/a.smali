.class public final synthetic Lio/getstream/chat/android/models/querysort/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Ljava/util/Comparator;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lio/getstream/chat/android/models/querysort/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lio/getstream/chat/android/models/querysort/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/models/querysort/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lio/getstream/chat/android/models/querysort/SortDirection;I)V
    .locals 0

    .line 2
    iput p3, p0, Lio/getstream/chat/android/models/querysort/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/models/querysort/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/models/querysort/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/models/querysort/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/m;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/a;->y:Ljava/lang/Object;

    check-cast v0, Lj93/w;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->b(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/querysort/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/querysort/SortDirection;

    check-cast p1, Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;

    check-cast p2, Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->a(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
