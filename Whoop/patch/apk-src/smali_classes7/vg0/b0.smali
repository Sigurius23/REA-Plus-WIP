.class public final Lvg0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltg0/c;",
        "Ltg0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lvg0/b0;",
        "Lod1/g;",
        "Ltg0/c;",
        "Ljs0/c;",
        "configurationRepository",
        "<init>",
        "(Ljs0/c;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljs0/c;",
        "bot_release"
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
.field private final a:Ljs0/c;


# direct methods
.method public constructor <init>(Ljs0/c;)V
    .locals 1

    const-string v0, "configurationRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg0/b0;->a:Ljs0/c;

    return-void
.end method

.method public static final synthetic c(Lvg0/b0;)Ljs0/c;
    .locals 0

    iget-object p0, p0, Lvg0/b0;->a:Ljs0/c;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvg0/b0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lvg0/b0$a;-><init>(Lvg0/b0;Lec3/l;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->l(Lc93/m;)Lec3/h;

    move-result-object p1

    return-object p1
.end method
