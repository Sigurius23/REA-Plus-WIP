.class public final Lxu2/b$d;
.super Lxu2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0008R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxu2/b$d;",
        "Lxu2/b;",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource$b;",
        "f",
        "Lcom/whoop/design/util/TextResource$b;",
        "l",
        "()Lcom/whoop/design/util/TextResource$b;",
        "title",
        "g",
        "j",
        "description",
        "h",
        "k",
        "primaryActionText",
        "Lhu2/b$c;",
        "i",
        "Lhu2/b$c;",
        "()Lhu2/b$c;",
        "approveEvent",
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


# static fields
.field public static final e:Lxu2/b$d;

.field private static final f:Lcom/whoop/design/util/TextResource$b;

.field private static final g:Lcom/whoop/design/util/TextResource$b;

.field private static final h:Lcom/whoop/design/util/TextResource$b;

.field private static final i:Lhu2/b$c;

.field public static final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxu2/b$d;

    invoke-direct {v0}, Lxu2/b$d;-><init>()V

    sput-object v0, Lxu2/b$d;->e:Lxu2/b$d;

    sget v0, Lcu2/h;->M:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$d;->f:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->L:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$d;->g:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->Q:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$d;->h:Lcom/whoop/design/util/TextResource$b;

    sget-object v0, Lhu2/b$c;->w:Lhu2/b$c;

    sput-object v0, Lxu2/b$d;->i:Lhu2/b$c;

    const/16 v0, 0x8

    sput v0, Lxu2/b$d;->j:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxu2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lhu2/b;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$d;->i()Lhu2/b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$d;->j()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$d;->k()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$d;->l()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public i()Lhu2/b$c;
    .locals 1

    sget-object v0, Lxu2/b$d;->i:Lhu2/b$c;

    return-object v0
.end method

.method public j()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$d;->g:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public k()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$d;->h:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public l()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$d;->f:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method
