.class public final Lrt0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrt0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrt0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lrt0/a$a;",
        "Lrt0/a;",
        "",
        "<init>",
        "()V",
        "connectivity-core_release"
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
.field public static final a:Lrt0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrt0/a$a;

    invoke-direct {v0}, Lrt0/a$a;-><init>()V

    sput-object v0, Lrt0/a$a;->a:Lrt0/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
