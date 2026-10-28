.class public final Loq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R1\u0010\u000e\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0008\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\n0\t0\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Loq2/b;",
        "",
        "<init>",
        "()V",
        "Loq2/a;",
        "a",
        "()Loq2/a;",
        "",
        "Lj93/d;",
        "Lkotlin/Function0;",
        "Loq2/c;",
        "Ljava/util/Map;",
        "b",
        "()Ljava/util/Map;",
        "stateToView",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Loq2/b;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Loq2/a;
    .locals 2

    new-instance v0, Loq2/a;

    iget-object v1, p0, Loq2/b;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Loq2/a;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loq2/b;->a:Ljava/util/Map;

    return-object v0
.end method
