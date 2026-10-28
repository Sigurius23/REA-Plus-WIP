.class public final Lu0/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/d0;

.field public final b:Lx1/b;


# direct methods
.method public constructor <init>(Ll3/d0;Lx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/j0;->a:Ll3/d0;

    iput-object p2, p0, Lu0/j0;->b:Lx1/b;

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/jvm/functions/Function3;
    .locals 1

    iget-object v0, p0, Lu0/j0;->b:Lx1/b;

    return-object v0
.end method

.method public final b()Ll3/d0;
    .locals 1

    iget-object v0, p0, Lu0/j0;->a:Ll3/d0;

    return-object v0
.end method
