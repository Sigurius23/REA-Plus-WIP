.class public final Lqb2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqb2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqb2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lqb2/e$a;",
        "Lqb2/e;",
        "<init>",
        "()V",
        "settings_release"
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
.field public static final a:Lqb2/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqb2/e$a;

    invoke-direct {v0}, Lqb2/e$a;-><init>()V

    sput-object v0, Lqb2/e$a;->a:Lqb2/e$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
