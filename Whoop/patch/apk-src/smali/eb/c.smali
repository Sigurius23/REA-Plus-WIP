.class public final Leb/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Leb/c;

.field public static final F:Leb/c;

.field public static final G:Leb/c;

.field public static final H:Leb/c;

.field public static final x:Leb/c;

.field public static final y:Leb/c;

.field public static final z:Leb/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->x:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->y:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->z:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->E:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->F:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->G:Leb/c;

    new-instance v0, Leb/c;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Leb/c;-><init>(II)V

    sput-object v0, Leb/c;->H:Leb/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Leb/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Leb/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0945

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Leb/a0;

    if-eqz v0, :cond_1

    check-cast p1, Leb/a0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Landroid/view/View;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/View;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    check-cast p1, Leb/n0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Leb/n0;->x:Leb/r0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_3

    check-cast p1, Landroid/app/Activity;

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_3
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast p1, Landroid/content/ContextWrapper;

    goto :goto_3

    :cond_4
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    :cond_5
    return-object v1

    :pswitch_4
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_6

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    return-object p1

    :pswitch_5
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_7

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_5

    :cond_7
    const/4 p1, 0x0

    :goto_5
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
