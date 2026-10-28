.class public final Ldj0/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj0/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Ldj0/l$c;",
        "Ldj0/l;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "b",
        "Ljava/lang/String;",
        "getName",
        "name",
        "auth_release"
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
.field public static final a:Ldj0/l$c;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldj0/l$c;

    invoke-direct {v0}, Ldj0/l$c;-><init>()V

    sput-object v0, Ldj0/l$c;->a:Ldj0/l$c;

    const-string v0, "completeMFA"

    sput-object v0, Ldj0/l$c;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    sget-object v0, Ldj0/l$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ldj0/l$c;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
