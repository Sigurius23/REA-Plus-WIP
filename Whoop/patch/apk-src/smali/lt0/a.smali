.class public interface abstract Llt0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0006\u0008f\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Llt0/a;",
        "",
        "",
        "commandName",
        "()Ljava/lang/String;",
        "",
        "getValue",
        "()I",
        "value",
        "",
        "getByteValue",
        "()B",
        "byteValue",
        "k",
        "a",
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
.field public static final k:Llt0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Llt0/a$a;->a:Llt0/a$a;

    sput-object v0, Llt0/a;->k:Llt0/a$a;

    return-void
.end method


# virtual methods
.method public commandName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getByteValue()B
.end method

.method public abstract getValue()I
.end method
