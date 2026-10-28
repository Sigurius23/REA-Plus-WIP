.class public abstract Lr93/o;
.super Lr93/r;
.source "SourceFile"


# instance fields
.field public final a:Lr93/m1;


# direct methods
.method public constructor <init>(Lr93/m1;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr93/o;->a:Lr93/m1;

    return-void
.end method
