.class public final Lww1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lww1/d;
.implements Lww1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lww1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lww1/d$a;",
        "Lww1/d;",
        "Lww1/a;",
        "<init>",
        "()V",
        "membership_release"
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
.field public static final a:Lww1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lww1/d$a;

    invoke-direct {v0}, Lww1/d$a;-><init>()V

    sput-object v0, Lww1/d$a;->a:Lww1/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
