.class public abstract Lv73/a;
.super Ll73/a;
.source "SourceFile"


# instance fields
.field public final x:Ll73/a;


# direct methods
.method public constructor <init>(Ll73/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "source is null"

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv73/a;->x:Ll73/a;

    return-void
.end method
