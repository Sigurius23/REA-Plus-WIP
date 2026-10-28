.class public final Lse2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lse2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lse2/c$b;",
        "Lse2/c;",
        "<init>",
        "()V",
        "sleep-coach_release"
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
.field public static final a:Lse2/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lse2/c$b;

    invoke-direct {v0}, Lse2/c$b;-><init>()V

    sput-object v0, Lse2/c$b;->a:Lse2/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
