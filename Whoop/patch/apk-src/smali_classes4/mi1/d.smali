.class public final Lmi1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi1/d$a;,
        Lmi1/d$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmi1/d;",
        "",
        "Ltr2/n;",
        "logger",
        "Lmi1/a;",
        "maverickHaptics",
        "Lb82/a;",
        "harvardHaptics",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Ltr2/n;Lmi1/a;Lb82/a;Lci2/b;)V",
        "",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "e",
        "f",
        "a",
        "Ltr2/n;",
        "b",
        "Lmi1/a;",
        "c",
        "Lb82/a;",
        "Lci2/b;",
        "Ljk0/d;",
        "()Ljk0/d;",
        "iWhoopStrap",
        "hapticsStrapService_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final e:Lmi1/d$a;

.field private static final f:Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lmi1/a;

.field private final c:Lb82/a;

.field private final d:Lci2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lmi1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmi1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmi1/d;->e:Lmi1/d$a;

    new-instance v2, Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/16 v3, 0x2f

    const/16 v4, 0x98

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;-><init>(IIIIIIIISI)V

    sput-object v2, Lmi1/d;->f:Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lmi1/a;Lb82/a;Lci2/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maverickHaptics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "harvardHaptics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmi1/d;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lmi1/d;->b:Lmi1/a;

    .line 4
    iput-object p3, p0, Lmi1/d;->c:Lb82/a;

    .line 5
    iput-object p4, p0, Lmi1/d;->d:Lci2/b;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lmi1/a;Lb82/a;Lci2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "StrainCoachHapticsWrapper"

    invoke-virtual {p1, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lmi1/d;-><init>(Ltr2/n;Lmi1/a;Lb82/a;Lci2/b;)V

    return-void
.end method

.method public static final synthetic a(Lmi1/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lmi1/d;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmi1/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lmi1/d;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c()Ljk0/d;
    .locals 1

    iget-object v0, p0, Lmi1/d;->d:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    return-object v0
.end method

.method private final d(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmi1/d$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmi1/d$c;

    iget v1, v0, Lmi1/d$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmi1/d$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmi1/d$c;

    invoke-direct {v0, p0, p1}, Lmi1/d$c;-><init>(Lmi1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lmi1/d$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmi1/d$c;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmi1/d;->c:Lb82/a;

    iput v4, v0, Lmi1/d$c;->y:I

    const/4 v2, 0x2

    invoke-interface {p1, v2, v3, v0}, Lb82/a;->a(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lak0/g;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lak0/g;->X()Lak0/f;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v0

    :goto_2
    sget-object v2, Lak0/f;->SUCCESS:Lak0/f;

    iget-object v5, p0, Lmi1/d;->a:Ltr2/n;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lak0/g;->X()Lak0/f;

    move-result-object v0

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v6, "Haptics Result: "

    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {v5, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-ne v1, v2, :cond_6

    move v3, v4

    :cond_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmi1/d$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmi1/d$d;

    iget v1, v0, Lmi1/d$d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmi1/d$d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmi1/d$d;

    invoke-direct {v0, p0, p1}, Lmi1/d$d;-><init>(Lmi1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lmi1/d$d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmi1/d$d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmi1/d;->b:Lmi1/a;

    sget-object v2, Lmi1/d;->f:Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;

    iput v3, v0, Lmi1/d$d;->y:I

    invoke-interface {p1, v2, v0}, Lmi1/a;->d(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lmi1/b;

    instance-of v0, p1, Lmi1/b$c;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lmi1/d;->a:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Maverick Haptics Result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0
.end method


# virtual methods
.method public final f(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lmi1/d;->c()Ljk0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lmi1/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    invoke-direct {p0, p1}, Lmi1/d;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-direct {p0, p1}, Lmi1/d;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
