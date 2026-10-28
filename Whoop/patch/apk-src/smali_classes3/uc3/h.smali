.class public final Luc3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Luc3/l;

.field public final c:I


# direct methods
.method public constructor <init>(Luc3/b;Luc3/l;I)V
    .locals 1

    const-string v0, "parserStructure"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc3/h;->a:Ljava/lang/Object;

    iput-object p2, p0, Luc3/h;->b:Luc3/l;

    iput p3, p0, Luc3/h;->c:I

    return-void
.end method
