.class public abstract Lb11/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb11/i$a;,
        Lb11/i$b;,
        Lb11/i$c;,
        Lb11/i$d;,
        Lb11/i$e;,
        Lb11/i$f;,
        Lb11/i$g;,
        Lb11/i$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0008\u0014\u0011\u001c\u001d\u000e\u000c\u0018\u001eB9\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\r\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000c\u0010\u0013R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u0082\u0001\u0008\u001f !\"#$%&\u00a8\u0006\'"
    }
    d2 = {
        "Lb11/i;",
        "",
        "",
        "icon",
        "statusIcon",
        "Lcom/whoop/design/util/TextResource;",
        "contentDescription",
        "",
        "enableIconAnimation",
        "minutes",
        "<init>",
        "(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;)V",
        "a",
        "I",
        "b",
        "()I",
        "getStatusIcon",
        "c",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "d",
        "Z",
        "getEnableIconAnimation",
        "()Z",
        "e",
        "Ljava/lang/Integer;",
        "getMinutes",
        "()Ljava/lang/Integer;",
        "g",
        "f",
        "h",
        "Lb11/i$a;",
        "Lb11/i$b;",
        "Lb11/i$c;",
        "Lb11/i$d;",
        "Lb11/i$e;",
        "Lb11/i$f;",
        "Lb11/i$g;",
        "Lb11/i$h;",
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


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Z

.field private final e:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lb11/i;->a:I

    .line 4
    iput p2, p0, Lb11/i;->b:I

    .line 5
    iput-object p3, p0, Lb11/i;->c:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-boolean p4, p0, Lb11/i;->d:Z

    .line 7
    iput-object p5, p0, Lb11/i;->e:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 8
    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-virtual {p1}, Lx81/d;->d()Lgz0/o0;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/g0;->e()I

    move-result p1

    :cond_0
    move v1, p1

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v2, p2

    move-object v3, p3

    .line 9
    invoke-direct/range {v0 .. v6}, Lb11/i;-><init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lb11/i;-><init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lb11/i;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lb11/i;->a:I

    return v0
.end method
