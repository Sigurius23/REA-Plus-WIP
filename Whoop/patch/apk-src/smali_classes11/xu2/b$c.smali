.class public final Lxu2/b$c;
.super Lxu2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0008R\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0011\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxu2/b$c;",
        "Lxu2/b;",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource$b;",
        "f",
        "Lcom/whoop/design/util/TextResource$b;",
        "m",
        "()Lcom/whoop/design/util/TextResource$b;",
        "title",
        "g",
        "j",
        "description",
        "h",
        "l",
        "primaryActionText",
        "Ly81/f;",
        "i",
        "Ly81/f;",
        "k",
        "()Ly81/f;",
        "primaryActionColor",
        "Lhu2/b$l;",
        "Lhu2/b$l;",
        "()Lhu2/b$l;",
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
.field public static final e:Lxu2/b$c;

.field private static final f:Lcom/whoop/design/util/TextResource$b;

.field private static final g:Lcom/whoop/design/util/TextResource$b;

.field private static final h:Lcom/whoop/design/util/TextResource$b;

.field private static final i:Ly81/f;

.field private static final j:Lhu2/b$l;

.field public static final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxu2/b$c;

    invoke-direct {v0}, Lxu2/b$c;-><init>()V

    sput-object v0, Lxu2/b$c;->e:Lxu2/b$c;

    sget v0, Lcu2/h;->t:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$c;->f:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->s:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$c;->g:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->T:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sput-object v0, Lxu2/b$c;->h:Lcom/whoop/design/util/TextResource$b;

    sget-object v0, Ly81/f;->ACCENT_ACTION:Ly81/f;

    sput-object v0, Lxu2/b$c;->i:Ly81/f;

    sget-object v0, Lhu2/b$l;->w:Lhu2/b$l;

    sput-object v0, Lxu2/b$c;->j:Lhu2/b$l;

    const/16 v0, 0x8

    sput v0, Lxu2/b$c;->k:I

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

    invoke-virtual {p0}, Lxu2/b$c;->i()Lhu2/b$l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$c;->j()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Ly81/e;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$c;->k()Ly81/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$c;->l()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$c;->m()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public i()Lhu2/b$l;
    .locals 1

    sget-object v0, Lxu2/b$c;->j:Lhu2/b$l;

    return-object v0
.end method

.method public j()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$c;->g:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public k()Ly81/f;
    .locals 1

    sget-object v0, Lxu2/b$c;->i:Ly81/f;

    return-object v0
.end method

.method public l()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$c;->h:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public m()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/b$c;->f:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method
