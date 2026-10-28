.class public final Lbl1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lbl1/b;",
        "",
        "Lz82/b;",
        "analyticsManager",
        "<init>",
        "(Lz82/b;)V",
        "Lbl1/a;",
        "analyticsEvent",
        "Ll83/a0;",
        "a",
        "(Lbl1/a;)V",
        "Lz82/b;",
        "help-center_release"
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
.field private final a:Lz82/b;


# direct methods
.method public constructor <init>(Lz82/b;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbl1/b;->a:Lz82/b;

    return-void
.end method


# virtual methods
.method public final a(Lbl1/a;)V
    .locals 7

    const-string v0, "analyticsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lbl1/b;->a:Lz82/b;

    invoke-interface {p1}, Lbl1/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lbl1/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lbl1/a;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lbl1/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1}, Lbl1/a;->d()Ljava/util/Map;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
