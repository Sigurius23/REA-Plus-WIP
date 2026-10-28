.class public final synthetic Lqi/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:Lqi/w;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lqi/w;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/u;->a:Lqi/w;

    iput p2, p0, Lqi/u;->b:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lqi/u;->a:Lqi/w;

    iget v1, p0, Lqi/u;->b:F

    invoke-virtual {v0, v1}, Lqi/w;->w(F)V

    return-void
.end method
