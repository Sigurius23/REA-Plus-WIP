.class public final Lf73/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz63/e;


# instance fields
.field public final a:Lf73/a;


# direct methods
.method public constructor <init>(Lf73/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf73/g;->a:Lf73/a;

    return-void
.end method


# virtual methods
.method public final a(Lb30/m;Lg9/k;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lf73/f;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object p2, p2, Lg9/k;->a:Ljava/util/HashMap;

    sget-object v2, Lf73/e;->a:Lz63/c;

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    move-object v1, p2

    :cond_0
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v1, p0, Lf73/g;->a:Lf73/a;

    invoke-direct {v0, p1, v1, p2}, Lf73/f;-><init>(La73/e;Lf73/a;Z)V

    return-object v0
.end method
