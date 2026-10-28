.class public final Luj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Luj/h;

.field public static final y:Luj/h;

.field public static final z:Luj/h;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Luj/h;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luj/h;-><init>(II)V

    sput-object v0, Luj/h;->x:Luj/h;

    new-instance v0, Luj/h;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Luj/h;-><init>(II)V

    sput-object v0, Luj/h;->y:Luj/h;

    new-instance v0, Luj/h;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Luj/h;-><init>(II)V

    sput-object v0, Luj/h;->z:Luj/h;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Luj/h;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luj/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_1
    check-cast p1, Lyb3/k;

    const-string v0, "match"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    iget-object p1, p1, Lyb3/n;->c:Lyb3/m;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lyb3/j;->a:Ljava/lang/String;

    if-nez v0, :cond_4

    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lyb3/j;->a:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p1, Lyb3/j;->a:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
