.class public final synthetic Lt81/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lc93/n;


# direct methods
.method public synthetic constructor <init>(Lc93/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt81/k;->w:Lc93/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu81/d;

    check-cast p2, Lu81/b;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    iget-object v0, p0, Lt81/k;->w:Lc93/n;

    invoke-static {v0, p1, p2, p3, p4}, Lt81/l$a;->f(Lc93/n;Lu81/d;Lu81/b;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
