.class public final Lzk0/j;
.super Ljs0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljs0/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lzk0/j;",
        "Ljs0/a;",
        "",
        "<init>",
        "()V",
        "bot_release"
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
.field public static final a:Lzk0/j;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk0/j;

    invoke-direct {v0}, Lzk0/j;-><init>()V

    sput-object v0, Lzk0/j;->a:Lzk0/j;

    const/16 v0, 0x8

    sput v0, Lzk0/j;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "AI_MARKDOWN_BOLD_WEIGHT"

    const-string v1, "Bold"

    invoke-direct {p0, v0, v1}, Ljs0/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
