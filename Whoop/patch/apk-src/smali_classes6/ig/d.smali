.class public final Lig/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/m;


# instance fields
.field public final w:Lyf/k;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyf/k;Ljava/lang/String;)V
    .locals 1

    const-string v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lig/d;->w:Lyf/k;

    iput-object p2, p0, Lig/d;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final e(Lhg/j;)Lhg/n;
    .locals 2

    new-instance v0, Ld1/j;

    iget-object v1, p0, Lig/d;->x:Ljava/lang/String;

    invoke-direct {v0, p0, p1, v1}, Ld1/j;-><init>(Lig/d;Lhg/j;Ljava/lang/String;)V

    return-object v0
.end method
