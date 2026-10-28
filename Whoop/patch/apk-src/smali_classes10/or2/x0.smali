.class public final synthetic Lor2/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/c;


# instance fields
.field public final synthetic w:Lor2/y0;

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lor2/y0;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/x0;->w:Lor2/y0;

    iput-object p2, p0, Lor2/x0;->x:Lc93/a;

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lor2/x0;->w:Lor2/y0;

    iget-object v1, p0, Lor2/x0;->x:Lc93/a;

    invoke-static {v0, v1}, Lor2/y0;->a(Lor2/y0;Lc93/a;)V

    return-void
.end method
