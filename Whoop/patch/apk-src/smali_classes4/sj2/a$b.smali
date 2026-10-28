.class public final Lsj2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsj2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lsj2/a$b;",
        "Lsj2/a;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "b",
        "I",
        "getPriority",
        "()I",
        "priority",
        "essentials_release"
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
.field public static final a:Lsj2/a$b;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsj2/a$b;

    invoke-direct {v0}, Lsj2/a$b;-><init>()V

    sput-object v0, Lsj2/a$b;->a:Lsj2/a$b;

    const/4 v0, 0x1

    sput v0, Lsj2/a$b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPriority()I
    .locals 1

    sget v0, Lsj2/a$b;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Low"

    return-object v0
.end method
