.class public final Lty1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lty1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lty1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000b\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lty1/a$a;",
        "Lty1/a;",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "()Lcom/whoop/design/util/TextResource;",
        "text",
        "",
        "c",
        "Z",
        "a",
        "()Z",
        "enabled",
        "Lv41/r0$d;",
        "d",
        "I",
        "()I",
        "lottieAnimation",
        "mfa_release"
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
.field public static final a:Lty1/a$a;

.field private static final b:Lcom/whoop/design/util/TextResource;

.field private static final c:Z

.field private static final d:I

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lty1/a$a;

    invoke-direct {v0}, Lty1/a$a;-><init>()V

    sput-object v0, Lty1/a$a;->a:Lty1/a$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Lty1/a$a;->b:Lcom/whoop/design/util/TextResource;

    sget v0, Lgy0/e;->d:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    sput v0, Lty1/a$a;->d:I

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lty1/a$a;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Lty1/a$a;->c:Z

    return v0
.end method

.method public bridge synthetic b()Lv41/r0;
    .locals 1

    invoke-virtual {p0}, Lty1/a$a;->c()I

    move-result v0

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    sget v0, Lty1/a$a;->d:I

    return v0
.end method

.method public getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    sget-object v0, Lty1/a$a;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
