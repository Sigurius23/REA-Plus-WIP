.class public final synthetic Lrd1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:Lrd1/d;

.field public final synthetic x:Ltd1/d;


# direct methods
.method public synthetic constructor <init>(Lrd1/d;Ltd1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd1/c;->w:Lrd1/d;

    iput-object p2, p0, Lrd1/c;->x:Ltd1/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lrd1/c;->x:Ltd1/d;

    check-cast p1, Ltd1/e;

    iget-object v1, p0, Lrd1/c;->w:Lrd1/d;

    invoke-static {v1, v0, p1}, Lrd1/d;->q(Lrd1/d;Ltd1/d;Ltd1/e;)V

    return-void
.end method
