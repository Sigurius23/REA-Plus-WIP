.class public final Lj80/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj80/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj80/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lj80/a$j;",
        "Lj80/a;",
        "<init>",
        "()V",
        "activation_release"
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
.field public static final a:Lj80/a$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj80/a$j;

    invoke-direct {v0}, Lj80/a$j;-><init>()V

    sput-object v0, Lj80/a$j;->a:Lj80/a$j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
