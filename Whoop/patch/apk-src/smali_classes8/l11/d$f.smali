.class public final Ll11/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll11/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll11/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ll11/d$f;",
        "Ll11/d;",
        "<init>",
        "()V",
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
.field public static final a:Ll11/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll11/d$f;

    invoke-direct {v0}, Ll11/d$f;-><init>()V

    sput-object v0, Ll11/d$f;->a:Ll11/d$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
