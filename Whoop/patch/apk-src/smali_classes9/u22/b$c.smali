.class public final Lu22/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu22/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu22/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lu22/b$c;",
        "Lu22/b$b;",
        "<init>",
        "()V",
        "payments_release"
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
.field public static final a:Lu22/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu22/b$c;

    invoke-direct {v0}, Lu22/b$c;-><init>()V

    sput-object v0, Lu22/b$c;->a:Lu22/b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
