.class public final Lyz/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyz/b;


# direct methods
.method public constructor <init>(Lyz/b;)V
    .locals 1

    const-string v0, "linkEventsReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyz/a;->a:Lyz/b;

    return-void
.end method
