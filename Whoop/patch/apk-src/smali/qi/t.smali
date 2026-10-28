.class public final synthetic Lqi/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:Lqi/w;


# direct methods
.method public synthetic constructor <init>(Lqi/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/t;->a:Lqi/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lqi/t;->a:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->m()V

    return-void
.end method
