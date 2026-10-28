.class public final Lnj0/f$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnj0/f$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj0/f$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0008\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\n\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lnj0/f$b$a$a;",
        "Lnj0/f$b$a;",
        "<init>",
        "()V",
        "Ljava/util/UUID;",
        "c",
        "Ljava/util/UUID;",
        "()Ljava/util/UUID;",
        "serviceId",
        "Lnj0/b;",
        "d",
        "Lnj0/b;",
        "()Lnj0/b;",
        "characteristics",
        "whoop-ble-api"
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
.field public static final b:Lnj0/f$b$a$a;

.field private static final c:Ljava/util/UUID;

.field private static final d:Lnj0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnj0/f$b$a$a;

    invoke-direct {v0}, Lnj0/f$b$a$a;-><init>()V

    sput-object v0, Lnj0/f$b$a$a;->b:Lnj0/f$b$a$a;

    invoke-static {}, Lnj0/e;->c()Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lnj0/f$b$a$a;->c:Ljava/util/UUID;

    sget-object v0, Lnj0/d;->a:Lnj0/d;

    invoke-virtual {v0}, Lnj0/d;->c()Lnj0/b;

    move-result-object v0

    sput-object v0, Lnj0/f$b$a$a;->d:Lnj0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge a()Lnj0/a;
    .locals 1

    invoke-super {p0}, Lnj0/f$b$a;->a()Lnj0/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge b()I
    .locals 1

    invoke-super {p0}, Lnj0/f$b$a;->b()I

    move-result v0

    return v0
.end method

.method public c()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lnj0/f$b$a$a;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public d()Lnj0/b;
    .locals 1

    sget-object v0, Lnj0/f$b$a$a;->d:Lnj0/b;

    return-object v0
.end method
