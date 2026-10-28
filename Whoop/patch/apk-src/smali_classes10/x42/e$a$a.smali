.class public final Lx42/e$a$a;
.super Ljs0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx42/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljs0/a<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lx42/e$a$a;",
        "Ljs0/a;",
        "",
        "<init>",
        "()V",
        "puffin_release"
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
.field public static final a:Lx42/e$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx42/e$a$a;

    invoke-direct {v0}, Lx42/e$a$a;-><init>()V

    sput-object v0, Lx42/e$a$a;->a:Lx42/e$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "PUFFIN_RECONNECT_INITIAL_DELAY_MILLIS"

    invoke-direct {p0, v1, v0}, Ljs0/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
