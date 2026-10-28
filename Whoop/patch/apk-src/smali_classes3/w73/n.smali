.class public final Lw73/n;
.super Lw73/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ll73/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lw73/a;-><init>(Ll73/c;)V

    return-void
.end method


# virtual methods
.method public final d(Ll73/d;)V
    .locals 1

    new-instance v0, Lw73/m;

    invoke-direct {v0, p1}, Lw73/m;-><init>(Ll73/d;)V

    iget-object p1, p0, Lw73/a;->w:Ll73/c;

    invoke-virtual {p1, v0}, Ll73/c;->c(Ll73/d;)V

    return-void
.end method
