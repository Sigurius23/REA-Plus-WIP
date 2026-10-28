.class public final Lb51/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb51/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb51/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lb51/c$a;",
        "Lb51/c;",
        "<init>",
        "()V",
        "Lb51/b;",
        "b",
        "Lb51/b;",
        "getRect",
        "()Lb51/b;",
        "rect",
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
.field public static final a:Lb51/c$a;

.field private static final b:Lb51/b;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lb51/c$a;

    invoke-direct {v0}, Lb51/c$a;-><init>()V

    sput-object v0, Lb51/c$a;->a:Lb51/c$a;

    new-instance v1, Lb51/b;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lb51/b;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lb51/c$a;->b:Lb51/b;

    const/16 v0, 0x8

    sput v0, Lb51/c$a;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
