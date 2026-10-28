.class public final Lhu2/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhu2/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lhu2/b$o;",
        "Lhu2/b$f;",
        "<init>",
        "()V",
        "weightlifting_release"
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
.field public static final w:Lhu2/b$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhu2/b$o;

    invoke-direct {v0}, Lhu2/b$o;-><init>()V

    sput-object v0, Lhu2/b$o;->w:Lhu2/b$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
