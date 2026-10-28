.class final Lhb1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb1/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lhb1/o;",
        "",
        "<init>",
        "()V",
        "Ly3/a;",
        "constraints",
        "",
        "c",
        "(J)Z",
        "",
        "detected",
        "Ll83/a0;",
        "b",
        "(JLjava/lang/String;)V",
        "",
        "a",
        "I",
        "detectedAtWidth",
        "detectedAtHeight",
        "value",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "direction",
        "d",
        "design_release"
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
.field private static final d:Lhb1/o$a;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhb1/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhb1/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhb1/o;->d:Lhb1/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lhb1/o;->a:I

    iput v0, p0, Lhb1/o;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhb1/o;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b(JLjava/lang/String;)V
    .locals 1

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    iput v0, p0, Lhb1/o;->a:I

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p1

    iput p1, p0, Lhb1/o;->b:I

    iput-object p3, p0, Lhb1/o;->c:Ljava/lang/String;

    return-void
.end method

.method public final c(J)Z
    .locals 2

    iget-object v0, p0, Lhb1/o;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    iget v1, p0, Lhb1/o;->a:I

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p1

    iget p2, p0, Lhb1/o;->b:I

    if-eq p1, p2, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
