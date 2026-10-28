.class public abstract Llq2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llq2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llq2/g$a;,
        Llq2/g$b;,
        Llq2/g$c;,
        Llq2/g$d;,
        Llq2/g$e;,
        Llq2/g$f;,
        Llq2/g$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0007\n\u0014\u000c\u0015\u0011\u0016\u0010B)\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u0011\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000b\u001a\u0004\u0008\n\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0013\u0082\u0001\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Llq2/g;",
        "Llq2/e;",
        "Li2/x;",
        "topEllipseColor",
        "sideEllipseColor",
        "bottomEllipseColor",
        "Llq2/f;",
        "option",
        "<init>",
        "(JJJLlq2/f;)V",
        "a",
        "J",
        "d",
        "()J",
        "setTopEllipseColor-8_81llA",
        "(J)V",
        "b",
        "c",
        "Llq2/f;",
        "()Llq2/f;",
        "e",
        "f",
        "g",
        "Llq2/g$a;",
        "Llq2/g$b;",
        "Llq2/g$c;",
        "Llq2/g$d;",
        "Llq2/g$e;",
        "Llq2/g$f;",
        "Llq2/g$g;",
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


# instance fields
.field private a:J

.field private final b:J

.field private final c:J

.field private final d:Llq2/f;


# direct methods
.method private constructor <init>(JJJLlq2/f;)V
    .locals 1

    const-string v0, "option"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Llq2/g;->a:J

    .line 4
    iput-wide p3, p0, Llq2/g;->b:J

    .line 5
    iput-wide p5, p0, Llq2/g;->c:J

    .line 6
    iput-object p7, p0, Llq2/g;->d:Llq2/f;

    return-void
.end method

.method public synthetic constructor <init>(JJJLlq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Llq2/g;-><init>(JJJLlq2/f;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Llq2/g;->c:J

    return-wide v0
.end method

.method public final b()Llq2/f;
    .locals 1

    iget-object v0, p0, Llq2/g;->d:Llq2/f;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Llq2/g;->b:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Llq2/g;->a:J

    return-wide v0
.end method
