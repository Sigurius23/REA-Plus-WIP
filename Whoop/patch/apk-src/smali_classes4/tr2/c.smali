.class public final synthetic Ltr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltr2/k;


# instance fields
.field public final synthetic w:Ltr2/d;

.field public final synthetic x:Ltr2/j;


# direct methods
.method public synthetic constructor <init>(Ltr2/d;Ltr2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltr2/c;->w:Ltr2/d;

    iput-object p2, p0, Ltr2/c;->x:Ltr2/j;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/event/LoggableEvent;)V
    .locals 2

    iget-object v0, p0, Ltr2/c;->w:Ltr2/d;

    iget-object v1, p0, Ltr2/c;->x:Ltr2/j;

    invoke-static {v0, v1, p1}, Ltr2/d;->a(Ltr2/d;Ltr2/j;Lcom/whoop/domain/model/event/LoggableEvent;)V

    return-void
.end method
