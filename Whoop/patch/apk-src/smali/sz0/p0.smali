.class public abstract Lsz0/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsz0/p0$a;,
        Lsz0/p0$b;,
        Lsz0/p0$c;,
        Lsz0/p0$d;,
        Lsz0/p0$e;,
        Lsz0/p0$f;,
        Lsz0/p0$g;,
        Lsz0/p0$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0008\n\u0013\u0014\u000c\u0015\u0016\u0017\u000eB%\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u0012\u0082\u0001\u0008\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lsz0/p0;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "icon",
        "Lkd1/o;",
        "imageSource",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ILkd1/o;)V",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "I",
        "()I",
        "Lkd1/o;",
        "()Lkd1/o;",
        "f",
        "g",
        "h",
        "e",
        "d",
        "Lsz0/p0$a;",
        "Lsz0/p0$b;",
        "Lsz0/p0$c;",
        "Lsz0/p0$d;",
        "Lsz0/p0$e;",
        "Lsz0/p0$f;",
        "Lsz0/p0$g;",
        "Lsz0/p0$h;",
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
.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:I

.field private final c:Lkd1/o;


# direct methods
.method private constructor <init>(Lcom/whoop/design/util/TextResource;ILkd1/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lsz0/p0;->a:Lcom/whoop/design/util/TextResource;

    .line 4
    iput p2, p0, Lsz0/p0;->b:I

    .line 5
    iput-object p3, p0, Lsz0/p0;->c:Lkd1/o;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ILkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p3, p5

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p5}, Lsz0/p0;-><init>(Lcom/whoop/design/util/TextResource;ILkd1/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ILkd1/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lsz0/p0;-><init>(Lcom/whoop/design/util/TextResource;ILkd1/o;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lsz0/p0;->b:I

    return v0
.end method

.method public final b()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lsz0/p0;->c:Lkd1/o;

    return-object v0
.end method

.method public c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/p0;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
