.class public abstract Lxu2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxu2/b$a;,
        Lxu2/b$b;,
        Lxu2/b$c;,
        Lxu2/b$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\u000b\u0011B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0011\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001cR\u0014\u0010#\u001a\u00020!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\"\u0082\u0001\u0004$%&\'\u00a8\u0006("
    }
    d2 = {
        "Lxu2/b;",
        "",
        "<init>",
        "()V",
        "Ly81/e;",
        "a",
        "Ly81/e;",
        "d",
        "()Ly81/e;",
        "primaryActionColor",
        "Lcom/whoop/design/util/TextResource$b;",
        "b",
        "Lcom/whoop/design/util/TextResource$b;",
        "f",
        "()Lcom/whoop/design/util/TextResource$b;",
        "secondaryActionText",
        "",
        "c",
        "Z",
        "g",
        "()Z",
        "showCloseIcon",
        "Lhu2/b$b;",
        "Lhu2/b$b;",
        "()Lhu2/b$b;",
        "dismissEvent",
        "Lcom/whoop/design/util/TextResource;",
        "h",
        "()Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "e",
        "primaryActionText",
        "Lhu2/b;",
        "()Lhu2/b;",
        "approveEvent",
        "Lxu2/b$a;",
        "Lxu2/b$b;",
        "Lxu2/b$c;",
        "Lxu2/b$d;",
        "weightlifting_release"
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
.field private final a:Ly81/e;

.field private final b:Lcom/whoop/design/util/TextResource$b;

.field private final c:Z

.field private final d:Lhu2/b$b;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Ly81/f;->ACCENT_ALERT:Ly81/f;

    iput-object v0, p0, Lxu2/b;->a:Ly81/e;

    .line 4
    sget v0, Lcu2/h;->b0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b;->b:Lcom/whoop/design/util/TextResource$b;

    .line 5
    sget-object v0, Lhu2/b$b;->w:Lhu2/b$b;

    iput-object v0, p0, Lxu2/b;->d:Lhu2/b$b;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxu2/b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lhu2/b;
.end method

.method public abstract b()Lcom/whoop/design/util/TextResource;
.end method

.method public final c()Lhu2/b$b;
    .locals 1

    iget-object v0, p0, Lxu2/b;->d:Lhu2/b$b;

    return-object v0
.end method

.method public d()Ly81/e;
    .locals 1

    iget-object v0, p0, Lxu2/b;->a:Ly81/e;

    return-object v0
.end method

.method public abstract e()Lcom/whoop/design/util/TextResource;
.end method

.method public final f()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b;->b:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lxu2/b;->c:Z

    return v0
.end method

.method public abstract h()Lcom/whoop/design/util/TextResource;
.end method
