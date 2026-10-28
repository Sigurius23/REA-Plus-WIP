.class public final Lhq2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lhq2/a;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "<init>",
        "(La6/g;)V",
        "",
        "year",
        "",
        "text",
        "Ll83/a0;",
        "f",
        "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "e",
        "c",
        "a",
        "La6/g;",
        "b",
        "user-journey_release"
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
.field public static final b:Lhq2/a$a;

.field public static final c:I

.field private static final d:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final e:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhq2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhq2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhq2/a;->b:Lhq2/a$a;

    const/16 v0, 0x8

    sput v0, Lhq2/a;->c:I

    const-string v0, "timeCapsuleText"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lhq2/a;->d:Lf6/d;

    const-string v0, "timeCapsuleYear"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lhq2/a;->e:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq2/a;->a:La6/g;

    return-void
.end method

.method public static final synthetic a()Lf6/d;
    .locals 1

    sget-object v0, Lhq2/a;->d:Lf6/d;

    return-object v0
.end method

.method public static final synthetic b()Lf6/d;
    .locals 1

    sget-object v0, Lhq2/a;->e:Lf6/d;

    return-object v0
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhq2/a;->a:La6/g;

    new-instance v1, Lhq2/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lhq2/a$b;-><init>(Lq83/d;)V

    invoke-static {v0, v1, p1}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhq2/a$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhq2/a$c;

    iget v1, v0, Lhq2/a$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhq2/a$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhq2/a$c;

    invoke-direct {v0, p0, p1}, Lhq2/a$c;-><init>(Lhq2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lhq2/a$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhq2/a$c;->y:I

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

    iget-object p1, p0, Lhq2/a;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Lhq2/a$c;->y:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v0, Lhq2/a;->d:Lf6/d;

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    return-object p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhq2/a$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhq2/a$d;

    iget v1, v0, Lhq2/a$d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhq2/a$d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhq2/a$d;

    invoke-direct {v0, p0, p1}, Lhq2/a$d;-><init>(Lhq2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lhq2/a$d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhq2/a$d;->y:I

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

    iget-object p1, p0, Lhq2/a;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Lhq2/a$d;->y:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v0, Lhq2/a;->e:Lf6/d;

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhq2/a;->a:La6/g;

    new-instance v1, Lhq2/a$e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lhq2/a$e;-><init>(ILjava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
