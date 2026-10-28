.class public final Llb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/room/v1;
.implements Llb/b0;


# instance fields
.field public final synthetic a:Llb/n;


# direct methods
.method public constructor <init>(Llb/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/j;->a:Llb/n;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llb/j;->a:Llb/n;

    invoke-virtual {v0, p1, p2, p3}, Llb/n;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ltb/a;
    .locals 1

    iget-object v0, p0, Llb/j;->a:Llb/n;

    iget-object v0, v0, Llb/n;->b:Ltb/a;

    return-object v0
.end method
