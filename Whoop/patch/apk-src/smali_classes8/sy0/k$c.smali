.class public final Lsy0/k$c;
.super Lsy0/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsy0/k;
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
        "Lsy0/k$c;",
        "Lsy0/k;",
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
.field public static final b:Lsy0/k$c;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsy0/k$c;

    invoke-direct {v0}, Lsy0/k$c;-><init>()V

    sput-object v0, Lsy0/k$c;->b:Lsy0/k$c;

    const/16 v0, 0x8

    sput v0, Lsy0/k$c;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lsy0/k;-><init>(Lb91/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
