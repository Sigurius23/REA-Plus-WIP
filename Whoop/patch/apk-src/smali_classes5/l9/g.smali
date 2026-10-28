.class public final synthetic Ll9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/d0;


# instance fields
.field public final synthetic a:Ll9/j;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll9/j;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/g;->a:Ll9/j;

    iput-object p2, p0, Ll9/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lu8/o0;)V
    .locals 2

    iget-object v0, p0, Ll9/g;->a:Ll9/j;

    iget-object v1, p0, Ll9/g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1, p2}, Ll9/j;->v(Ljava/lang/Object;Ll9/a;Lu8/o0;)V

    return-void
.end method
