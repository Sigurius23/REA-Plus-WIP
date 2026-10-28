.class public final Lea2/i;
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
        "Lea2/i;",
        "Ljs0/a;",
        "",
        "<init>",
        "()V",
        "app_prodStandardRelease"
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
.field public static final a:Lea2/i;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea2/i;

    invoke-direct {v0}, Lea2/i;-><init>()V

    sput-object v0, Lea2/i;->a:Lea2/i;

    const/16 v0, 0x8

    sput v0, Lea2/i;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "LANGUAGE_BETA_FEEDBACK_URL"

    const-string v1, "https://whoopinc.typeform.com/to/Sb7cQwYr#user_identifier="

    invoke-direct {p0, v0, v1}, Ljs0/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
