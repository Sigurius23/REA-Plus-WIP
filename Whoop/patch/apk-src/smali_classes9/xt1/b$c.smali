.class public final Lxt1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxt1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxt1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lxt1/b$c;",
        "Lxt1/b;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "labrador_release"
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
.field public static final a:Lxt1/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxt1/b$c;

    invoke-direct {v0}, Lxt1/b$c;-><init>()V

    sput-object v0, Lxt1/b$c;->a:Lxt1/b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "FullScreenError"

    return-object v0
.end method
