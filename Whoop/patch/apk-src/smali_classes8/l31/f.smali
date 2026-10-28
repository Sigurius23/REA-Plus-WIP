.class public final Ll31/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Ll31/f;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource$e;",
        "b",
        "Lcom/whoop/design/util/TextResource$e;",
        "e",
        "()Lcom/whoop/design/util/TextResource$e;",
        "title",
        "c",
        "description",
        "d",
        "a",
        "checkBoxText",
        "primaryActionText",
        "f",
        "secondaryActionText",
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
.field public static final a:Ll31/f;

.field private static final b:Lcom/whoop/design/util/TextResource$e;

.field private static final c:Lcom/whoop/design/util/TextResource$e;

.field private static final d:Lcom/whoop/design/util/TextResource$e;

.field private static final e:Lcom/whoop/design/util/TextResource$e;

.field private static final f:Lcom/whoop/design/util/TextResource$e;

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll31/f;

    invoke-direct {v0}, Ll31/f;-><init>()V

    sput-object v0, Ll31/f;->a:Ll31/f;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Sample Modal title"

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Ll31/f;->b:Lcom/whoop/design/util/TextResource$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Aenean lacinia bibendum nulla sed consectetur. Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Donec id elit non mi porta gravida at eget metus."

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Ll31/f;->c:Lcom/whoop/design/util/TextResource$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "TEXT LABEL"

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Ll31/f;->d:Lcom/whoop/design/util/TextResource$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Primary Action"

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Ll31/f;->e:Lcom/whoop/design/util/TextResource$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Secondary Action"

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Ll31/f;->f:Lcom/whoop/design/util/TextResource$e;

    const/16 v0, 0x8

    sput v0, Ll31/f;->g:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource$e;
    .locals 1

    sget-object v0, Ll31/f;->d:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource$e;
    .locals 1

    sget-object v0, Ll31/f;->c:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource$e;
    .locals 1

    sget-object v0, Ll31/f;->e:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource$e;
    .locals 1

    sget-object v0, Ll31/f;->f:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource$e;
    .locals 1

    sget-object v0, Ll31/f;->b:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method
