.class public final Leb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Leb/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;Leb/l;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/f;->a:Ljava/lang/String;

    iput-object p2, p0, Leb/f;->b:Leb/l;

    return-void
.end method
